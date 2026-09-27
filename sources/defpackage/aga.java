package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class aga implements txg {
    public final /* synthetic */ int a;
    public final String b;
    public final boolean c;

    public aga(oda odaVar) {
        this.a = 0;
        this.b = odaVar.h;
        this.c = odaVar.k != y34.NONE;
    }

    @Override // defpackage.txg
    public void a(KClass kClass, KClass kClass2, KSerializer kSerializer) {
        SerialDescriptor descriptor = kSerializer.getDescriptor();
        o5l kind = descriptor.getKind();
        if (!(kind instanceof pwe) && !Intrinsics.areEqual(kind, bxg.g)) {
            boolean z = this.c;
            if (!z || (!Intrinsics.areEqual(kind, u9i.h) && !Intrinsics.areEqual(kind, u9i.i) && !(kind instanceof q5f) && !(kind instanceof cxg))) {
                if (z) {
                    int d = descriptor.d();
                    for (int i = 0; i < d; i++) {
                        String e = descriptor.e(i);
                        if (Intrinsics.areEqual(e, this.b)) {
                            qp7.j(kClass2, " has property '", "Polymorphic serializer for ", e, "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            fi9.e(kClass2.getSimpleName(), " of kind ", "Serializer for ", kind, " cannot be serialized polymorphically with class discriminator.");
            return;
        }
        fi9.e(kClass2.getSimpleName(), " can't be registered as a subclass for polymorphic serialization because its kind ", "Serializer for ", kind, " is not concrete. To work with multiple hierarchies, register it as a base class.");
    }

    @Override // defpackage.txg
    public void f(KClass kClass, Function1 function1) {
        kClass.getClass();
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "Markdown:" + this.b;
            default:
                return super.toString();
        }
    }

    public aga(String str) {
        this.a = 1;
        this.b = str;
        this.c = false;
    }

    public aga(String str, boolean z) {
        this.a = 1;
        this.b = str;
        this.c = z;
    }

    public /* synthetic */ aga(int i, String str, boolean z) {
        this.a = i;
        this.c = z;
        this.b = str;
    }

    @Override // defpackage.txg
    public void c(KClass kClass, Function1 function1) {
    }

    @Override // defpackage.txg
    public void d(KClass kClass, KSerializer kSerializer) {
    }

    @Override // defpackage.txg
    public void e(KClass kClass, Function1 function1) {
    }
}
