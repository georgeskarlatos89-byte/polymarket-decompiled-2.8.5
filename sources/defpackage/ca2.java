package defpackage;

import android.content.Context;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import com.polymarket.designtokens.DesignTokens;
import com.socure.docv.capturesdk.common.utils.BlurConstants;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class ca2 {
    public final Vibrator a;

    public ca2(Context context) {
        context.getClass();
        Object systemService = context.getSystemService("vibrator_manager");
        systemService.getClass();
        Vibrator defaultVibrator = ((VibratorManager) systemService).getDefaultVibrator();
        defaultVibrator.getClass();
        this.a = defaultVibrator;
    }

    public final void a(DesignTokens.Haptic haptic) {
        haptic.getClass();
        if (DesignTokens.Haptic.INSTANCE.isEnabled()) {
            Vibrator vibrator = this.a;
            if (vibrator.hasVibrator()) {
                switch (ba2.a[haptic.ordinal()]) {
                    case 1:
                        b(7, 0, 24L, BlurConstants.H_BD);
                        return;
                    case 2:
                        b(2, 5, 40L, 255);
                        return;
                    case 3:
                        b(3, 1, 30L, 220);
                        return;
                    case 4:
                        b(8, 2, 12L, 120);
                        return;
                    case 5:
                        b(8, 2, 10L, 96);
                        return;
                    case 6:
                        b(1, 0, 20L, 170);
                        return;
                    case 7:
                        b(2, 5, 42L, 255);
                        return;
                    case 8:
                        b(7, 2, 10L, 90);
                        return;
                    case 9:
                        if (vibrator.areAllPrimitivesSupported(1)) {
                            vibrator.vibrate(VibrationEffect.startComposition().addPrimitive(1).addPrimitive(1, 1.0f, 150).compose());
                            return;
                        } else {
                            vibrator.vibrate(VibrationEffect.createWaveform(new long[]{0, 15, 150, 15}, new int[]{0, 120, 0, 120}, -1));
                            return;
                        }
                    case 10:
                        return;
                    default:
                        dmk.a();
                        return;
                }
            }
        }
    }

    public final void b(Integer num, Integer num2, long j, int i) {
        int[] iArr = {num.intValue()};
        Vibrator vibrator = this.a;
        if (vibrator.areAllPrimitivesSupported(iArr)) {
            vibrator.vibrate(VibrationEffect.startComposition().addPrimitive(num.intValue()).compose());
        } else {
            vibrator.vibrate(VibrationEffect.createPredefined(num2.intValue()));
        }
    }
}
