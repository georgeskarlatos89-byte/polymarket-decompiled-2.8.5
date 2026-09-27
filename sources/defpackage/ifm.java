package defpackage;

import com.google.android.gms.internal.mlkit_vision_mediapipe.zzhu;
import java.util.HashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class ifm {
    public static final ht7 a = new ht7(4);

    public static void a() {
        HashMap hashMap = a.a;
        if (hashMap.containsKey(mxl.class) && !((String) hashMap.get(mxl.class)).equals("drishti.InferenceCalculatorOptions.Delegate")) {
            throw new zzhu(bdm.ALREADY_EXISTS.ordinal(), "Protobuf type name: drishti.InferenceCalculatorOptions.Delegate conflicts with: ".concat(String.valueOf((String) hashMap.get(mxl.class))));
        }
        hashMap.put(mxl.class, "drishti.InferenceCalculatorOptions.Delegate");
    }
}
