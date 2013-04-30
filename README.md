PrimePushCounter
================

PrimePush - Counter; includes PrimeFaces 4.0, Atmosphere 1.0.13 snapshot (2013-04-26)

Similar to the following PrimeFaces Push - Counter example, but using PrimeFaces Push - FacesMessage example as well:

http://www.primefaces.org/showcase/push/counter.jsf

Created this to show that, on full page refresh, using TomEE 1.6.0 snapshot (2013-04-29) along with Atmosphere 1.0.13 snapshot (2013-04-26), the following is showing up in log file on every full page refresh:

INFO: /counter support Out Of Order Broadcast: false


as seen in log file below:


Apr 30, 2013 2:03:21 PM org.atmosphere.cpr.AtmosphereFramework interceptor
INFO: Installed AtmosphereInterceptor Atmosphere LifeCycle. 
Apr 30, 2013 2:03:21 PM org.atmosphere.cpr.DefaultBroadcaster <init>
INFO: /* support Out Of Order Broadcast: false
Apr 30, 2013 2:03:21 PM org.atmosphere.cpr.AtmosphereFramework addAtmosphereHandler
INFO: Installed AtmosphereHandler org.primefaces.push.PrimeAtmosphereHandler mapped to context-path: /*
Apr 30, 2013 2:03:21 PM org.apache.coyote.AbstractProtocol start
INFO: Starting ProtocolHandler ["http-nio-8080"]
Apr 30, 2013 2:03:21 PM org.apache.coyote.AbstractProtocol start
INFO: Starting ProtocolHandler ["ajp-bio-8009"]
Apr 30, 2013 2:03:21 PM org.apache.catalina.startup.Catalina start
INFO: Server startup in 3298 ms
Apr 30, 2013 2:07:06 PM org.apache.myfaces.el.unified.ResolverBuilderBase sortELResolvers
INFO: Chain of EL resolvers for JSP sorted with: org.apache.myfaces.el.unified.OpenWebBeansELResolverComparator@18de5f7d and the result order is [org.apache.myfaces.el.unified.resolver.implicitobject.ImplicitObjectResolver@2f4f144c, org.apache.myfaces.el.FlashELResolver@70bda1d7, org.apache.myfaces.el.unified.resolver.ManagedBeanResolver@31cc6414, org.apache.myfaces.el.unified.resolver.ResourceBundleResolver@61be7696, org.apache.myfaces.el.unified.resolver.ResourceResolver@1f5ba3fc, org.apache.webbeans.el22.WebBeansELResolver@396b0579, org.apache.myfaces.el.convert.VariableResolverToELResolver@21346862, org.apache.myfaces.el.convert.PropertyResolverToELResolver@77b10af5]
Apr 30, 2013 2:07:06 PM org.apache.myfaces.el.unified.ResolverBuilderBase sortELResolvers
INFO: Chain of EL resolvers for Faces sorted with: org.apache.myfaces.el.unified.OpenWebBeansELResolverComparator@18de5f7d and the result order is [org.apache.myfaces.el.unified.resolver.implicitobject.ImplicitObjectResolver@34d7b8cd, org.apache.myfaces.el.unified.resolver.CompositeComponentELResolver@3ea5b5d5, org.apache.webbeans.el22.WebBeansELResolver@396b0579, org.apache.myfaces.el.convert.VariableResolverToELResolver@7144d314, org.apache.myfaces.el.convert.PropertyResolverToELResolver@5d7e0024, org.apache.myfaces.el.FlashELResolver@7b3b6b6f, org.apache.myfaces.el.unified.resolver.ManagedBeanResolver@7a0a839d, org.apache.myfaces.el.unified.resolver.ResourceResolver@4846f703, javax.el.ResourceBundleELResolver@2b030b07, org.apache.myfaces.el.unified.resolver.ResourceBundleResolver@54c90ea0, javax.el.MapELResolver@5bdf55dc, javax.el.ListELResolver@237e0da3, javax.el.ArrayELResolver@28b15a89, javax.el.BeanELResolver@13aeed3e]
Apr 30, 2013 2:07:07 PM org.atmosphere.cpr.DefaultBroadcaster <init>
INFO: /counter support Out Of Order Broadcast: false
Apr 30, 2013 2:18:16 PM org.atmosphere.cpr.DefaultBroadcaster <init>
INFO: /counter support Out Of Order Broadcast: false
