package org.IFOSRS;


import com.google.inject.AbstractModule;
import com.google.inject.Provider;
import com.google.inject.Singleton;
import net.eternalclient.api.utilities.Log;
import org.IFOSRS.Logging.Logger;

@Singleton
public class LoggerImpl extends Logger implements Provider<Logger>
{
    @Override
    public Logger get()
    {
        return new LoggerImpl();
    }

    @Override
    protected void _log(Object o)
    {
        System.out.print("Pls work pls pls" + o);
        Log.info(o.toString());
    }
}
