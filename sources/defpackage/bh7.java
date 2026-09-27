package defpackage;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class bh7 implements KSerializer {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;
    public final Object d;

    public bh7(KSerializer kSerializer, int i) {
        this.a = i;
        switch (i) {
            case 3:
                kSerializer.getClass();
                this.b = kSerializer;
                yk0 yk0Var = new yk0(kSerializer, 0);
                this.c = yk0Var;
                this.d = a2l.b("androidx.compose.runtime.SnapshotStateList", (sk0) yk0Var.c);
                return;
            default:
                this.b = kSerializer;
                bh7 bh7Var = new bh7(kSerializer, 3);
                this.c = bh7Var;
                this.d = a2l.b("androidx.navigation3.runtime.NavBackStack", (npk) bh7Var.d);
                return;
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Enum[] enumArr = (Enum[]) obj;
                int f = decoder.f(getDescriptor());
                if (f >= 0 && f < enumArr.length) {
                    return enumArr[f];
                }
                throw new IllegalArgumentException(f + " is not among valid " + getDescriptor().h() + " enum values, values size is " + enumArr.length);
            case 1:
                return new dtc((ddh) decoder.q((bh7) this.c));
            case 2:
                SerialDescriptor descriptor = getDescriptor();
                xq4 a = decoder.a(descriptor);
                int p = a.p(getDescriptor());
                if (p == -1) {
                    a.b(descriptor);
                    return obj;
                }
                throw new IllegalArgumentException(ace.f(p, "Unexpected index "));
            default:
                List list = (List) decoder.q((yk0) this.c);
                ddh ddhVar = new ddh();
                ddhVar.addAll(CollectionsKt.M0(list));
                return ddhVar;
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                return (SerialDescriptor) ((Lazy) obj).getValue();
            case 1:
                return (npk) obj;
            case 2:
                return (SerialDescriptor) ((Lazy) obj).getValue();
            default:
                return (npk) obj;
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        switch (this.a) {
            case 0:
                Enum r5 = (Enum) obj;
                r5.getClass();
                Enum[] enumArr = (Enum[]) this.b;
                int E = ArraysKt.E(enumArr, r5);
                if (E != -1) {
                    encoder.m(getDescriptor(), E);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(r5);
                String h = getDescriptor().h();
                String arrays = Arrays.toString(enumArr);
                arrays.getClass();
                sb.append(" is not a valid enum ");
                sb.append(h);
                sb.append(", must be one of ");
                sb.append(arrays);
                throw new IllegalArgumentException(sb.toString());
            case 1:
                encoder.o((bh7) this.c, ((dtc) obj).a);
                return;
            case 2:
                obj.getClass();
                encoder.a(getDescriptor()).b(getDescriptor());
                return;
            default:
                ddh ddhVar = (ddh) obj;
                ddhVar.getClass();
                encoder.o((yk0) this.c, ddhVar);
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().h() + '>';
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bh7(String str, Object obj, Annotation[] annotationArr) {
        this(str, obj);
        this.a = 2;
        obj.getClass();
        List asList = Arrays.asList(annotationArr);
        asList.getClass();
        this.c = asList;
    }

    public bh7(String str, Object obj) {
        this.a = 2;
        obj.getClass();
        this.b = obj;
        this.c = CollectionsKt.emptyList();
        this.d = LazyKt.a(w4b.PUBLICATION, new dlc(8, str, this));
    }

    public bh7(String str, Enum[] enumArr) {
        this.a = 0;
        str.getClass();
        enumArr.getClass();
        this.b = enumArr;
        this.d = LazyKt.lazy(new pq5(16, this, str));
    }
}
