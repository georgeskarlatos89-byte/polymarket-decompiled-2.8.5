package defpackage;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class sv2 implements lja, Serializable, usa {
    public static final Object NO_RECEIVER = rv2.a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient lja reflected;
    private final String signature;

    public sv2(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // defpackage.lja
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // defpackage.lja
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public lja compute() {
        lja ljaVar = this.reflected;
        if (ljaVar == null) {
            lja computeReflected = computeReflected();
            this.reflected = computeReflected;
            return computeReflected;
        }
        return ljaVar;
    }

    public abstract lja computeReflected();

    @Override // defpackage.usa
    public GenericDeclaration findJavaDeclaration() {
        return v2n.c(getOwner(), getSignature());
    }

    @Override // defpackage.kja
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // defpackage.lja
    public String getName() {
        return this.name;
    }

    public uja getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            return lvf.a.getOrCreateKotlinPackage(cls, "");
        }
        return lvf.a.getOrCreateKotlinClass(cls);
    }

    @Override // defpackage.lja
    public List<mka> getParameters() {
        return getReflected().getParameters();
    }

    public lja getReflected() {
        lja compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new eta();
    }

    @Override // defpackage.lja
    public wka getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // defpackage.lja, kotlin.reflect.jvm.internal.KTypeParameterOwnerImpl
    public List<yka> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // defpackage.lja
    public gla getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // defpackage.lja
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // defpackage.lja
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // defpackage.lja
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // defpackage.lja, defpackage.vja
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public sv2() {
        this(NO_RECEIVER, null, null, null, false);
    }
}
