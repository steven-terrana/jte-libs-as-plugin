package org.boozallen.libraries.sdp 


import org.boozallen.plugins.jte.config.libraries.LibraryProvidingPlugin
import org.boozallen.plugins.jte.config.libraries.LibraryProvidingPlugin.LibraryProvidingPluginDescriptor
import hudson.Extension 
import org.kohsuke.stapler.DataBoundConstructor


class SDPLibraryProvider extends LibraryProvidingPlugin{
    @Extension public static class DescriptorImpl extends LibraryProvidingPluginDescriptor{}
}