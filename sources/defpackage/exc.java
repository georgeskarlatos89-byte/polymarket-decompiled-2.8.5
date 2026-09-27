package defpackage;

import com.polymarket.usviewmodels.PaymentMethodsViewModel;
import io.radar.sdk.RadarTripOptions;
import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class exc implements us8 {
    public static final exc a;
    private static final SerialDescriptor descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [exc, java.lang.Object, us8] */
    static {
        ?? obj = new Object();
        a = obj;
        dse dseVar = new dse("com.polymarket.android.ui.features.payments.NavGraphPayments.PaymentMethodsScreen", obj, 2);
        dseVar.j(RadarTripOptions.KEY_MODE, false);
        dseVar.j("autoStartAction", true);
        descriptor = dseVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = gxc.c;
        return new KSerializer[]{lazyArr[0].getValue(), bin.c((KSerializer) lazyArr[1].getValue())};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        xq4 a2 = decoder.a(serialDescriptor);
        Lazy[] lazyArr = gxc.c;
        boolean z = true;
        int i = 0;
        PaymentMethodsViewModel.Mode mode = null;
        PaymentMethodsViewModel.AutoStartAction autoStartAction = null;
        while (z) {
            int p = a2.p(serialDescriptor);
            if (p != -1) {
                if (p != 0) {
                    if (p == 1) {
                        autoStartAction = (PaymentMethodsViewModel.AutoStartAction) a2.B(serialDescriptor, 1, (KSerializer) lazyArr[1].getValue(), autoStartAction);
                        i |= 2;
                    } else {
                        dmk.b(p);
                        return null;
                    }
                } else {
                    mode = (PaymentMethodsViewModel.Mode) a2.D(serialDescriptor, 0, (KSerializer) lazyArr[0].getValue(), mode);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        a2.b(serialDescriptor);
        return new gxc(i, mode, autoStartAction);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        gxc gxcVar = (gxc) obj;
        gxcVar.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        yq4 a2 = encoder.a(serialDescriptor);
        Lazy[] lazyArr = gxc.c;
        KSerializer kSerializer = (KSerializer) lazyArr[0].getValue();
        PaymentMethodsViewModel.Mode mode = gxcVar.a;
        PaymentMethodsViewModel.AutoStartAction autoStartAction = gxcVar.b;
        a2.f(serialDescriptor, 0, kSerializer, mode);
        if (a2.r(serialDescriptor) || autoStartAction != null) {
            a2.j(serialDescriptor, 1, (KSerializer) lazyArr[1].getValue(), autoStartAction);
        }
        a2.b(serialDescriptor);
    }
}
