package osgi.enroute.compile;

import aQute.bnd.annotation.headers.RequireCapability;

/**
 * The purpose of this capability is to be never satisfied. This can be required
 * by bundles that are compile only or class path only.
 */
@RequireCapability(ns = "osgi.missing", filter = "(&(missing=true)(missing=false))")
public @interface Unresolvable {

}