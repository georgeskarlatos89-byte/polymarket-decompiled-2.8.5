package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class k7k {
    public final fl0 a;
    public final fl0 b;
    public final fl0 c;

    public k7k(fl0 fl0Var, fl0 fl0Var2, fl0 fl0Var3) {
        this.a = fl0Var;
        this.b = fl0Var2;
        this.c = fl0Var3;
    }

    public abstract l7k a();

    public final Class b(Class cls) {
        String name = cls.getName();
        fl0 fl0Var = this.c;
        Class cls2 = (Class) fl0Var.get(name);
        if (cls2 == null) {
            Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
            fl0Var.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    public final Method c(String str) {
        fl0 fl0Var = this.a;
        Method method = (Method) fl0Var.get(str);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, k7k.class.getClassLoader()).getDeclaredMethod("read", k7k.class);
            fl0Var.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        fl0 fl0Var = this.b;
        Method method = (Method) fl0Var.get(name);
        if (method == null) {
            Class b = b(cls);
            System.currentTimeMillis();
            Method declaredMethod = b.getDeclaredMethod("write", cls, k7k.class);
            fl0Var.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public abstract boolean e(int i);

    public final Parcelable f(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((l7k) this).e.readParcelable(l7k.class.getClassLoader());
    }

    public final m7k g() {
        String readString = ((l7k) this).e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (m7k) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e) {
            omf.m("VersionedParcel encountered ClassNotFoundException", e);
            return null;
        } catch (IllegalAccessException e2) {
            omf.m("VersionedParcel encountered IllegalAccessException", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            omf.m("VersionedParcel encountered NoSuchMethodException", e3);
            return null;
        } catch (InvocationTargetException e4) {
            if (!(e4.getCause() instanceof RuntimeException)) {
                omf.m("VersionedParcel encountered InvocationTargetException", e4);
                return null;
            }
            throw ((RuntimeException) e4.getCause());
        }
    }

    public abstract void h(int i);

    public final void i(m7k m7kVar) {
        if (m7kVar == null) {
            ((l7k) this).e.writeString(null);
            return;
        }
        try {
            ((l7k) this).e.writeString(b(m7kVar.getClass()).getName());
            l7k a = a();
            try {
                d(m7kVar.getClass()).invoke(null, m7kVar, a);
                Parcel parcel = a.e;
                int i = a.i;
                if (i >= 0) {
                    int i2 = a.d.get(i);
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(dataPosition - i2);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e) {
                omf.m("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                omf.m("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                omf.m("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    omf.m("VersionedParcel encountered InvocationTargetException", e4);
                    return;
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            omf.m(m7kVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
