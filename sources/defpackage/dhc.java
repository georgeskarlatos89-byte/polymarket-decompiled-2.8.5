package defpackage;

import com.stripe.android.model.MobileFallbackWebviewParams$WebviewRequirementType;
import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class dhc implements us8 {
    public static final dhc a;
    private static final SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, us8, dhc] */
    static {
        ?? obj = new Object();
        a = obj;
        dse dseVar = new dse("com.stripe.android.model.MobileFallbackWebviewParams", obj, 2);
        dseVar.j("webview_requirement_type", false);
        dseVar.j("webview_open_url", true);
        descriptor = dseVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ghc.c[0].getValue(), bin.c(b2i.a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        xq4 a2 = decoder.a(serialDescriptor);
        Lazy[] lazyArr = ghc.c;
        boolean z = true;
        int i = 0;
        MobileFallbackWebviewParams$WebviewRequirementType mobileFallbackWebviewParams$WebviewRequirementType = null;
        String str = null;
        while (z) {
            int p = a2.p(serialDescriptor);
            if (p != -1) {
                if (p != 0) {
                    if (p == 1) {
                        str = (String) a2.B(serialDescriptor, 1, b2i.a, str);
                        i |= 2;
                    } else {
                        dmk.b(p);
                        return null;
                    }
                } else {
                    mobileFallbackWebviewParams$WebviewRequirementType = (MobileFallbackWebviewParams$WebviewRequirementType) a2.D(serialDescriptor, 0, (KSerializer) lazyArr[0].getValue(), mobileFallbackWebviewParams$WebviewRequirementType);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        a2.b(serialDescriptor);
        return new ghc(i, mobileFallbackWebviewParams$WebviewRequirementType, str);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ghc ghcVar = (ghc) obj;
        ghcVar.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        yq4 a2 = encoder.a(serialDescriptor);
        KSerializer kSerializer = (KSerializer) ghc.c[0].getValue();
        MobileFallbackWebviewParams$WebviewRequirementType mobileFallbackWebviewParams$WebviewRequirementType = ghcVar.a;
        String str = ghcVar.b;
        a2.f(serialDescriptor, 0, kSerializer, mobileFallbackWebviewParams$WebviewRequirementType);
        if (a2.r(serialDescriptor) || str != null) {
            a2.j(serialDescriptor, 1, b2i.a, str);
        }
        a2.b(serialDescriptor);
    }
}
