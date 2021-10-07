/*
    the combination of package/class name will need to be
    unique per jenkins instance in the case where you
    plan to install multiple library providing plugins
*/
package customize_this


import org.boozallen.plugins.jte.init.governance.libs.LibraryProvidingPlugin
import org.boozallen.plugins.jte.init.governance.libs.LibraryProvidingPlugin.LibraryProvidingPluginDescriptor
import hudson.Extension
import org.kohsuke.stapler.DataBoundConstructor

class MyLibraries extends LibraryProvidingPlugin{
    @DataBoundConstructor MyLibraries(){}
    @Extension public static class DescriptorImpl extends LibraryProvidingPluginDescriptor{}
}
