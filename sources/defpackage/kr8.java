package defpackage;

import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final /* synthetic */ class kr8 implements us8 {
    public static final kr8 a;
    private static final SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [kr8, java.lang.Object, us8] */
    static {
        ?? obj = new Object();
        a = obj;
        dse dseVar = new dse("io.ktor.util.date.GMTDate", obj, 9);
        dseVar.j("seconds", false);
        dseVar.j("minutes", false);
        dseVar.j("hours", false);
        dseVar.j("dayOfWeek", false);
        dseVar.j("dayOfMonth", false);
        dseVar.j("dayOfYear", false);
        dseVar.j("month", false);
        dseVar.j("year", false);
        dseVar.j("timestamp", false);
        descriptor = dseVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = mr8.j;
        k1a k1aVar = k1a.a;
        return new KSerializer[]{k1aVar, k1aVar, k1aVar, lazyArr[3].getValue(), k1aVar, k1aVar, lazyArr[6].getValue(), k1aVar, cub.a};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0022. Please report as an issue. */
    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        xq4 a2 = decoder.a(serialDescriptor);
        Lazy[] lazyArr = mr8.j;
        Object obj = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        ejk ejkVar = null;
        long j = 0;
        boolean z = true;
        kkc kkcVar = null;
        while (z) {
            int p = a2.p(serialDescriptor);
            switch (p) {
                case -1:
                    z = false;
                case 0:
                    i2 = a2.m(serialDescriptor, 0);
                    i |= 1;
                    obj = null;
                case 1:
                    i3 = a2.m(serialDescriptor, 1);
                    i |= 2;
                    obj = null;
                case 2:
                    i4 = a2.m(serialDescriptor, 2);
                    i |= 4;
                    obj = null;
                case 3:
                    ejkVar = (ejk) a2.D(serialDescriptor, 3, (KSerializer) lazyArr[3].getValue(), ejkVar);
                    i |= 8;
                    obj = null;
                case 4:
                    i5 = a2.m(serialDescriptor, 4);
                    i |= 16;
                    obj = null;
                case 5:
                    i6 = a2.m(serialDescriptor, 5);
                    i |= 32;
                    obj = null;
                case 6:
                    kkcVar = (kkc) a2.D(serialDescriptor, 6, (KSerializer) lazyArr[6].getValue(), kkcVar);
                    i |= 64;
                    obj = null;
                case 7:
                    i7 = a2.m(serialDescriptor, 7);
                    i |= 128;
                case 8:
                    j = a2.g(serialDescriptor, 8);
                    i |= 256;
                default:
                    dmk.b(p);
                    return obj;
            }
        }
        a2.b(serialDescriptor);
        return new mr8(i, i2, i3, i4, ejkVar, i5, i6, kkcVar, i7, j);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        mr8 mr8Var = (mr8) obj;
        mr8Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        yq4 a2 = encoder.a(serialDescriptor);
        Lazy[] lazyArr = mr8.j;
        a2.w(0, mr8Var.a, serialDescriptor);
        a2.w(1, mr8Var.b, serialDescriptor);
        a2.w(2, mr8Var.c, serialDescriptor);
        a2.f(serialDescriptor, 3, (KSerializer) lazyArr[3].getValue(), mr8Var.d);
        a2.w(4, mr8Var.e, serialDescriptor);
        a2.w(5, mr8Var.f, serialDescriptor);
        a2.f(serialDescriptor, 6, (KSerializer) lazyArr[6].getValue(), mr8Var.g);
        a2.w(7, mr8Var.h, serialDescriptor);
        a2.E(serialDescriptor, 8, mr8Var.i);
        a2.b(serialDescriptor);
    }
}
