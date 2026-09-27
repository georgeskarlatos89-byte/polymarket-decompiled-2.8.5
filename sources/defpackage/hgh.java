package defpackage;

import java.util.List;
import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class hgh {
    public final <T> KSerializer serializer(final KSerializer kSerializer) {
        kSerializer.getClass();
        return new us8(kSerializer) { // from class: ggh
            public final /* synthetic */ KSerializer a;
            private final SerialDescriptor descriptor;

            {
                kSerializer.getClass();
                dse dseVar = new dse("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", this, 2);
                dseVar.j("keys", false);
                dseVar.j("values", false);
                this.descriptor = dseVar;
                this.a = kSerializer;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.us8
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{igh.c[0].getValue(), new yk0(this.a, 0)};
            }

            @Override // kotlinx.serialization.KSerializer
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = this.descriptor;
                xq4 a = decoder.a(serialDescriptor);
                Lazy[] lazyArr = igh.c;
                boolean z = true;
                int i = 0;
                List list = null;
                List list2 = null;
                while (z) {
                    int p = a.p(serialDescriptor);
                    if (p != -1) {
                        if (p != 0) {
                            if (p == 1) {
                                list2 = (List) a.D(serialDescriptor, 1, new yk0(this.a, 0), list2);
                                i |= 2;
                            } else {
                                dmk.b(p);
                                return null;
                            }
                        } else {
                            list = (List) a.D(serialDescriptor, 0, (KSerializer) lazyArr[0].getValue(), list);
                            i |= 1;
                        }
                    } else {
                        z = false;
                    }
                }
                a.b(serialDescriptor);
                return new igh(i, list, list2);
            }

            @Override // kotlinx.serialization.KSerializer
            public final SerialDescriptor getDescriptor() {
                return this.descriptor;
            }

            @Override // kotlinx.serialization.KSerializer
            public final void serialize(Encoder encoder, Object obj) {
                igh ighVar = (igh) obj;
                ighVar.getClass();
                SerialDescriptor serialDescriptor = this.descriptor;
                yq4 a = encoder.a(serialDescriptor);
                a.f(serialDescriptor, 0, (KSerializer) igh.c[0].getValue(), ighVar.a);
                a.f(serialDescriptor, 1, new yk0(this.a, 0), ighVar.b);
                a.b(serialDescriptor);
            }

            @Override // defpackage.us8
            public final KSerializer[] typeParametersSerializers() {
                return new KSerializer[]{this.a};
            }
        };
    }
}
