package defpackage;

import android.hardware.camera2.CameraAccessException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class pz2 extends Exception {
    public static final Set b = Collections.unmodifiableSet(new HashSet(Arrays.asList(4, 5, 1, 2, 3)));
    public final int a;

    static {
        Collections.unmodifiableSet(new HashSet(Arrays.asList(10001, 10002)));
    }

    public pz2(String str, AssertionError assertionError) {
        super(String.format("%s (%d): %s", "CAMERA_CHARACTERISTICS_CREATION_ERROR", 10002, str), assertionError);
        this.a = 10002;
        if (b.contains(10002)) {
            new CameraAccessException(10002, str, assertionError);
        }
    }

    public pz2(CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.a = cameraAccessException.getReason();
    }
}
