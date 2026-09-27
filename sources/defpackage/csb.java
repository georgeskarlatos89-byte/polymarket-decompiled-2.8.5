package defpackage;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class csb {
    public static volatile int a;
    public static final ibi b = new ibi();
    public static final src c = new src();
    public static final boolean d;
    public static volatile acg e;
    public static final String[] f;

    static {
        String str;
        boolean equalsIgnoreCase;
        try {
            str = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            equalsIgnoreCase = false;
        } else {
            equalsIgnoreCase = str.equalsIgnoreCase("true");
        }
        d = equalsIgnoreCase;
        f = new String[]{"2.0"};
    }

    public static ArrayList a() {
        ServiceLoader serviceLoader;
        ArrayList arrayList = new ArrayList();
        final ClassLoader classLoader = csb.class.getClassLoader();
        String property = System.getProperty("slf4j.provider");
        acg acgVar = null;
        if (property != null && !property.isEmpty()) {
            try {
                q0g.d("Attempting to load provider \"" + property + "\" specified via \"slf4j.provider\" system property");
                acgVar = (acg) classLoader.loadClass(property).getConstructor(null).newInstance(null);
            } catch (ClassCastException e2) {
                q0g.b("Specified SLF4JServiceProvider (" + property + ") does not implement SLF4JServiceProvider interface", e2);
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e3) {
                q0g.b("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e3);
            }
        }
        if (acgVar != null) {
            arrayList.add(acgVar);
            return arrayList;
        }
        if (System.getSecurityManager() == null) {
            serviceLoader = ServiceLoader.load(acg.class, classLoader);
        } else {
            serviceLoader = (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: bsb
                @Override // java.security.PrivilegedAction
                public final Object run() {
                    return ServiceLoader.load(acg.class, classLoader);
                }
            });
        }
        Iterator it = serviceLoader.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add((acg) it.next());
            } catch (ServiceConfigurationError e4) {
                q0g.a("A service provider failed to instantiate:\n" + e4.getMessage());
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.SecurityManager] */
    public static asb b(Class cls) {
        int i;
        j1k j1kVar;
        asb c2 = c(cls.getName());
        if (d) {
            j1k j1kVar2 = t1k.a;
            Class cls2 = null;
            j1k j1kVar3 = j1kVar2;
            if (j1kVar2 == null) {
                if (t1k.b) {
                    j1kVar3 = null;
                } else {
                    try {
                        j1kVar = new SecurityManager();
                    } catch (SecurityException unused) {
                        j1kVar = null;
                    }
                    t1k.a = j1kVar;
                    t1k.b = true;
                    j1kVar3 = j1kVar;
                }
            }
            if (j1kVar3 != null) {
                Class[] classContext = j1kVar3.getClassContext();
                String name = t1k.class.getName();
                int i2 = 0;
                while (i2 < classContext.length && !name.equals(classContext[i2].getName())) {
                    i2++;
                }
                if (i2 < classContext.length && (i = i2 + 2) < classContext.length) {
                    cls2 = classContext[i];
                } else {
                    dmk.n("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
                    return null;
                }
            }
            if (cls2 != null && !cls2.isAssignableFrom(cls)) {
                q0g.f("Detected logger name mismatch. Given name: \"" + c2.getName() + "\"; computed name: \"" + cls2.getName() + "\".");
                q0g.f("See https://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
            }
        }
        return c2;
    }

    public static asb c(String str) {
        return d().a().a(str);
    }

    public static acg d() {
        if (a == 0) {
            synchronized (csb.class) {
                try {
                    if (a == 0) {
                        a = 1;
                        e();
                    }
                } finally {
                }
            }
        }
        int i = a;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return c;
                    }
                    dmk.n("Unreachable code");
                    return null;
                }
                return e;
            }
            dmk.n("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
            return null;
        }
        return b;
    }

    public static final void e() {
        Enumeration<URL> resources;
        try {
            ArrayList a2 = a();
            i(a2);
            if (!a2.isEmpty()) {
                e = (acg) a2.get(0);
                oxb c2 = e.c();
                if (c2 != null) {
                    vbn.a = c2;
                }
                e.getClass();
                a = 3;
                g(a2);
            } else {
                a = 4;
                q0g.f("No SLF4J providers were found.");
                q0g.f("Defaulting to no-operation (NOP) logger implementation");
                q0g.f("See https://www.slf4j.org/codes.html#noProviders for further details.");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                    ClassLoader classLoader = csb.class.getClassLoader();
                    if (classLoader == null) {
                        resources = ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class");
                    } else {
                        resources = classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
                    }
                    while (resources.hasMoreElements()) {
                        linkedHashSet.add(resources.nextElement());
                    }
                } catch (IOException e2) {
                    q0g.b("Error getting resources from path", e2);
                }
                h(linkedHashSet);
            }
            f();
            if (a == 3) {
                try {
                    String b2 = e.b();
                    boolean z = false;
                    for (String str : f) {
                        if (b2.startsWith(str)) {
                            z = true;
                        }
                    }
                    if (!z) {
                        q0g.f("The requested version " + b2 + " by your slf4j provider is not compatible with " + Arrays.asList(f).toString());
                        q0g.f("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
                    }
                } catch (Throwable th) {
                    q0g.b("Unexpected problem occurred during version sanity check", th);
                }
            }
        } catch (Exception e3) {
            a = 2;
            q0g.b("Failed to instantiate SLF4J LoggerFactory", e3);
            fi9.n("Unexpected initialization failure", e3);
        }
    }

    public static void f() {
        ibi ibiVar = b;
        synchronized (ibiVar) {
            try {
                ibiVar.a.a = true;
                Iterator it = new ArrayList(ibiVar.a.b.values()).iterator();
                while (it.hasNext()) {
                    fbi fbiVar = (fbi) it.next();
                    fbiVar.b = c(fbiVar.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        LinkedBlockingQueue linkedBlockingQueue = b.a.c;
        int size = linkedBlockingQueue.size();
        ArrayList arrayList = new ArrayList(128);
        int i = 0;
        while (linkedBlockingQueue.drainTo(arrayList, 128) != 0) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                hbi hbiVar = (hbi) it2.next();
                if (hbiVar != null) {
                    fbi fbiVar2 = hbiVar.b;
                    String str = fbiVar2.a;
                    if (fbiVar2.b != null) {
                        if (!(fbiVar2.b instanceof qrc)) {
                            if (fbiVar2.n()) {
                                if (fbiVar2.k(hbiVar.a) && fbiVar2.n()) {
                                    try {
                                        fbiVar2.d.invoke(fbiVar2.b, hbiVar);
                                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                                    }
                                }
                            } else {
                                q0g.f(str);
                            }
                        }
                    } else {
                        dmk.n("Delegate logger cannot be null at this state.");
                        return;
                    }
                }
                int i2 = i + 1;
                if (i == 0) {
                    if (hbiVar.b.n()) {
                        q0g.f("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        q0g.f("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        q0g.f("See also https://www.slf4j.org/codes.html#replay");
                    } else if (!(hbiVar.b.b instanceof qrc)) {
                        q0g.f("The following set of substitute loggers may have been accessed");
                        q0g.f("during the initialization phase. Logging calls during this");
                        q0g.f("phase were not honored. However, subsequent logging calls to these");
                        q0g.f("loggers will work as normally expected.");
                        q0g.f("See also https://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i = i2;
            }
            arrayList.clear();
        }
        gbi gbiVar = b.a;
        gbiVar.b.clear();
        gbiVar.c.clear();
    }

    public static void g(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() > 1) {
                q0g.d("Actual provider is of type [" + arrayList.get(0) + "]");
                return;
            }
            String str = "Connected with provider of type [" + ((acg) arrayList.get(0)).getClass().getName() + "]";
            if (q0g.e(o0g.DEBUG)) {
                q0g.c().println("SLF4J(D): ".concat(str));
                return;
            }
            return;
        }
        dmk.n("No providers were found which is impossible after successful initialization.");
    }

    public static void h(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.isEmpty()) {
            return;
        }
        q0g.f("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            q0g.f("Ignoring binding found at [" + ((URL) it.next()) + "]");
        }
        q0g.f("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    public static void i(ArrayList arrayList) {
        if (arrayList.size() > 1) {
            q0g.f("Class path contains multiple SLF4J providers.");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                q0g.f("Found provider [" + ((acg) it.next()) + "]");
            }
            q0g.f("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }
}
