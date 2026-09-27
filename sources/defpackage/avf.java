package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.TypeVariable;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class avf extends quf implements taa, xaa {
    public final TypeVariable a;

    public avf(TypeVariable typeVariable) {
        typeVariable.getClass();
        this.a = typeVariable;
    }

    @Override // defpackage.taa
    public final cuf a(xl8 xl8Var) {
        AnnotatedElement annotatedElement;
        Annotation[] declaredAnnotations;
        xl8Var.getClass();
        TypeVariable typeVariable = this.a;
        if (typeVariable instanceof AnnotatedElement) {
            annotatedElement = (AnnotatedElement) typeVariable;
        } else {
            annotatedElement = null;
        }
        if (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) {
            return null;
        }
        return ytn.a(declaredAnnotations, xl8Var);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof avf) {
            if (Intrinsics.areEqual(this.a, ((avf) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.taa
    public final Collection getAnnotations() {
        AnnotatedElement annotatedElement;
        Collection emptyList;
        Annotation[] declaredAnnotations;
        TypeVariable typeVariable = this.a;
        if (typeVariable instanceof AnnotatedElement) {
            annotatedElement = (AnnotatedElement) typeVariable;
        } else {
            annotatedElement = null;
        }
        if (annotatedElement != null && (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) != null) {
            emptyList = ytn.b(declaredAnnotations);
        } else {
            emptyList = CollectionsKt.emptyList();
        }
        return emptyList;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return avf.class.getName() + ": " + this.a;
    }
}
