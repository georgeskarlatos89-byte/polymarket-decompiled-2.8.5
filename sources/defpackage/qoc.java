package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.KTypeParameterOwnerImpl;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class qoc implements KClass, KTypeParameterOwnerImpl, pgj {
    public final KClass a;
    public final String b;
    public final List c;
    public final List d;

    public qoc(KClass kClass, String str, Function1 function1, Function1 function12) {
        kClass.getClass();
        str.getClass();
        this.a = kClass;
        this.b = str;
        this.c = (List) function1.invoke(this);
        this.d = (List) function12.invoke(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qoc) {
            if (Intrinsics.areEqual(this.a, ((qoc) obj).a)) {
                return true;
            }
            return false;
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
        return this.a.getObjectInstance();
    }

    @Override // kotlin.reflect.KClass
    public final String getQualifiedName() {
        return this.b;
    }

    @Override // kotlin.reflect.KClass
    public final String getSimpleName() {
        return StringsKt.l0(this.b);
    }

    @Override // kotlin.reflect.KClass
    public final List getSupertypes() {
        return this.d;
    }

    @Override // kotlin.reflect.KClass, kotlin.reflect.jvm.internal.KTypeParameterOwnerImpl
    public final List getTypeParameters() {
        return this.c;
    }

    @Override // kotlin.reflect.KClass
    public final int hashCode() {
        return this.a.hashCode();
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
        return "MutableCollectionKClass(" + this.a + ')';
    }
}
