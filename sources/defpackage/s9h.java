package defpackage;

import android.util.Size;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class s9h {
    public static final Size a = new Size(0, 0);
    public static final Size b;
    public static final Size c;
    public static final Size d;
    public static final Size e;
    public static final Size f;

    static {
        new Size(320, 240);
        b = new Size(640, 480);
        c = new Size(ConstantsKt.MIN_FRONT_CAMERA_HEIGHT, 480);
        d = new Size(ConstantsKt.MIN_FRONT_CAMERA_WIDTH, ConstantsKt.MIN_FRONT_CAMERA_HEIGHT);
        e = new Size(1920, 1080);
        f = new Size(1920, 1440);
        new Size(2560, 1440);
        new Size(3840, 2160);
    }

    public static int a(Size size) {
        return size.getHeight() * size.getWidth();
    }
}
