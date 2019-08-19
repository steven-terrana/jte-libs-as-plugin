/*
    the combination of package/class name will need to be 
    unique per jenkins instance in the case where you
    plan to install multiple library providing plugins 
*/
package customize_this


import org.boozallen.plugins.jte.config.libraries.LibraryProvidingPlugin
import org.boozallen.plugins.jte.config.libraries.LibraryProvidingPlugin.LibraryProvidingPluginDescriptor
import hudson.Extension 

class MyLibraries extends LibraryProvidingPlugin{
    @Extension public static class DescriptorImpl extends LibraryProvidingPluginDescriptor{}
}