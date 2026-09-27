package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.KTypeParameterOwnerImpl;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class cad implements KClass, KTypeParameterOwnerImpl, pgj {
    public static final cad b = new cad();
    public final /* synthetic */ KClass a = lvf.a.getOrCreateKotlinClass(Void.class);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return false;
    }

    @Override // defpackage.kja
    public final List getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override // kotlin.reflect.KClass
    public final Collection getConstructors() {
        return this.a.getConstructors();
    }

    @Override // kotlin.reflect.KClass
    public final Collection getMembers() {
        return this.a.getMembers();
    }

    @Override // kotlin.reflect.KClass
    public final Collection getNestedClasses() {
        return this.a.getNestedClasses();
    }

    @Override // kotlin.reflect.KClass
    public final Object getObjectInstance() {
        return (Void) this.a.getObjectInstance();
    }

    @Override // kotlin.reflect.KClass
    public final String getQualifiedName() {
        return "kotlin.Nothing";
    }

    @Override // kotlin.reflect.KClass
    public final String getSimpleName() {
        return "Nothing";
    }

    @Override // kotlin.reflect.KClass
    public final List getSupertypes() {
        return this.a.getSupertypes();
    }

    @Override // kotlin.reflect.KClass, kotlin.reflect.jvm.internal.KTypeParameterOwnerImpl
    public final List getTypeParameters() {
        return this.a.getTypeParameters();
    }

    @Override // kotlin.reflect.KClass
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // kotlin.reflect.KClass
    public final boolean isAbstract() {
        return this.a.isAbstract();
    }

    @Override // kotlin.reflect.KClass
    public final boolean isCompanion() {
        return this.a.isCompanion();
    }

    @Override // kotlin.reflect.KClass
    public final boolean isInner() {
        return this.a.isInner();
    }

    @Override // kotlin.reflect.KClass
    public final boolean isInstance(Object obj) {
        return this.a.isInstance(obj);
    }

    @Override // kotlin.reflect.KClass
    public final boolean isSealed() {
        return this.a.isSealed();
    }

    @Override // kotlin.reflect.KClass
    public final boolean isValue() {
        return this.a.isValue();
    }

    public final String toString() {
        return "NothingKClass";
    }
}
