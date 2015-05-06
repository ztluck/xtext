package org.eclipse.xtext.resource.containers;

import static com.google.common.collect.Lists.*;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsData;

import com.google.common.collect.Lists;

/**
 * This implementation of {@link IAllContainersState} looks whether a {@link ResourceDescriptionsData} is installed on the wrapped {@link ResourceSet} 
 * and delegates to that. If no such adapter is installed it uses the contents of the {@link ResourceSet}. Resource that are loaded after this class has been created are also considered.
 * 
 * @author Moritz Eysholdt - Initial contribution and API
 * @since 2.3
 */
public class FlatResourceSetBasedAllContainersState extends AdapterImpl implements IAllContainersState {

	private final static String HANDLE = "all";

	public static String getHandle() {
		return HANDLE;
	}

	private ResourceSet resourceSet;

	public FlatResourceSetBasedAllContainersState(ResourceSet rs) {
		super();
		this.resourceSet = rs;
	}

	@Override
	public Collection<URI> getContainedURIs(String containerHandle) {
		if (!HANDLE.equals(containerHandle))
			return Collections.emptySet();
		if (resourceSet instanceof XtextResourceSet) {
			XtextResourceSet xtextResourceSet = (XtextResourceSet) resourceSet;
			ResourceDescriptionsData descriptionsData = ResourceDescriptionsData.ResourceSetAdapter.findResourceDescriptionsData(resourceSet);
			if (descriptionsData != null) {
				return descriptionsData.getAllURIs();
			}
			return newArrayList(xtextResourceSet.getNormalizationMap().values());
		}
		List<URI> uris = Lists.newArrayListWithCapacity(resourceSet.getResources().size());
		URIConverter uriConverter = resourceSet.getURIConverter();
		for (Resource r : resourceSet.getResources())
			uris.add(uriConverter.normalize(r.getURI()));
		return uris;
	}

	@Override
	public String getContainerHandle(URI uri) {
		return HANDLE;
	}

	public ResourceSet getResourceSet() {
		return resourceSet;
	}

	@Override
	public List<String> getVisibleContainerHandles(String handle) {
		return Collections.singletonList(HANDLE);
	}

	@Override
	public boolean isAdapterForType(Object type) {
		return IAllContainersState.class == type || FlatResourceSetBasedAllContainersState.class == type;
	}

	@Override
	public boolean isEmpty(String containerHandle) {
		return !HANDLE.equals(containerHandle);
	}

}