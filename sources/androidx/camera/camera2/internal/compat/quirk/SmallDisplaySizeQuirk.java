package androidx.camera.camera2.internal.compat.quirk;

import android.util.Size;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.ykf;
import java.util.HashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class SmallDisplaySizeQuirk implements ykf {
    public static final HashMap a;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put("REDMI NOTE 8", new Size(1080, 2340));
        hashMap.put("REDMI NOTE 7", new Size(1080, 2340));
        hashMap.put("SM-A207M", new Size(ConstantsKt.MIN_FRONT_CAMERA_HEIGHT, 1560));
        hashMap.put("REDMI NOTE 7S", new Size(1080, 2340));
        hashMap.put("SM-A127F", new Size(ConstantsKt.MIN_FRONT_CAMERA_HEIGHT, 1600));
        hashMap.put("SM-A536E", new Size(1080, 2400));
        hashMap.put("220233L2I", new Size(ConstantsKt.MIN_FRONT_CAMERA_HEIGHT, 1600));
        hashMap.put("V2149", new Size(ConstantsKt.MIN_FRONT_CAMERA_HEIGHT, 1600));
        hashMap.put("VIVO 1920", new Size(1080, 2340));
        hashMap.put("CPH2223", new Size(1080, 2400));
        hashMap.put("V2029", new Size(ConstantsKt.MIN_FRONT_CAMERA_HEIGHT, 1600));
        hashMap.put("CPH1901", new Size(ConstantsKt.MIN_FRONT_CAMERA_HEIGHT, 1520));
        hashMap.put("REDMI Y3", new Size(ConstantsKt.MIN_FRONT_CAMERA_HEIGHT, 1520));
        hashMap.put("SM-A045M", new Size(ConstantsKt.MIN_FRONT_CAMERA_HEIGHT, 1600));
        hashMap.put("SM-A146U", new Size(1080, 2408));
        hashMap.put("CPH1909", new Size(ConstantsKt.MIN_FRONT_CAMERA_HEIGHT, 1520));
        hashMap.put("NOKIA 4.2", new Size(ConstantsKt.MIN_FRONT_CAMERA_HEIGHT, 1520));
        hashMap.put("SM-G960U1", new Size(1440, 2960));
        hashMap.put("SM-A137F", new Size(1080, 2408));
        hashMap.put("VIVO 1816", new Size(ConstantsKt.MIN_FRONT_CAMERA_HEIGHT, 1520));
        hashMap.put("INFINIX X6817", new Size(ConstantsKt.MIN_FRONT_CAMERA_HEIGHT, 1612));
        hashMap.put("SM-A037F", new Size(ConstantsKt.MIN_FRONT_CAMERA_HEIGHT, 1600));
        hashMap.put("NOKIA 2.4", new Size(ConstantsKt.MIN_FRONT_CAMERA_HEIGHT, 1600));
        hashMap.put("SM-A125M", new Size(ConstantsKt.MIN_FRONT_CAMERA_HEIGHT, 1600));
        hashMap.put("INFINIX X670", new Size(1080, 2400));
    }
}
