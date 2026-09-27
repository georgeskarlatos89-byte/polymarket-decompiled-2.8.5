package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk;
import defpackage.g03;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class AeFpsRangeLegacyQuirk implements AeFpsRangeQuirk {
    public final Range a;

    public AeFpsRangeLegacyQuirk(g03 g03Var) {
        Range[] rangeArr = (Range[]) g03Var.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        Range range = null;
        if (rangeArr != null && rangeArr.length != 0) {
            for (Range range2 : rangeArr) {
                Range range3 = new Range(Integer.valueOf(((Integer) range2.getLower()).intValue() >= 1000 ? ((Integer) range2.getLower()).intValue() / 1000 : ((Integer) range2.getLower()).intValue()), Integer.valueOf(((Integer) range2.getUpper()).intValue() >= 1000 ? ((Integer) range2.getUpper()).intValue() / 1000 : ((Integer) range2.getUpper()).intValue()));
                if (((Integer) range3.getUpper()).intValue() == 30 && (range == null || ((Integer) range3.getLower()).intValue() < ((Integer) range.getLower()).intValue())) {
                    range = range3;
                }
            }
        }
        this.a = range;
    }
}
