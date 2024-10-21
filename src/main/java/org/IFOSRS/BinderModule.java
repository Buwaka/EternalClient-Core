package org.IFOSRS;

import com.google.inject.AbstractModule;
import org.IFOSRS.Logging.Logger;

public class BinderModule extends AbstractModule
{

    @Override
    protected void configure()
    {
        requestStaticInjection(LoggerImpl.class);
        bind(Logger.class).toProvider(LoggerImpl.class).asEagerSingleton();
    }
}
