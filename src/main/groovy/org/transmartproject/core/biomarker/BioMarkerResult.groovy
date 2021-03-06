package org.transmartproject.core.biomarker

/**
 * The type returned by
 * {@link BioMarkerResource#retrieveBioMarkers(List<BioMarkerConstraint>)}.
 *
 * In general, the iterator can be fetched only once.
 */
interface BioMarkerResult extends Closeable, Iterable<BioMarker> {}
