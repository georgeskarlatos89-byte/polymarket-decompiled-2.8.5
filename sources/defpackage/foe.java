package defpackage;

import android.os.Build;
import android.view.View;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class foe implements c49 {
    public final View a;

    public foe(View view) {
        this.a = view;
    }

    public final void a(int i) {
        int i2 = 0;
        int i3 = 16;
        if (i != 16) {
            if (i == 6) {
                i3 = 6;
            } else {
                i3 = 13;
                if (i != 13) {
                    i3 = 23;
                    if (i != 23) {
                        i3 = 3;
                        if (i != 3) {
                            if (i == 0) {
                                i3 = 0;
                            } else {
                                i3 = 17;
                                if (i != 17) {
                                    i3 = 27;
                                    if (i != 27) {
                                        i3 = 26;
                                        if (i != 26) {
                                            i3 = 9;
                                            if (i != 9) {
                                                i3 = 22;
                                                if (i != 22) {
                                                    i3 = 21;
                                                    if (i != 21) {
                                                        i3 = 1;
                                                        if (i != 1) {
                                                            i3 = -1;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        WeakHashMap weakHashMap = k9k.a;
        if (i3 == -1) {
            i2 = -1;
        } else {
            if (Build.VERSION.SDK_INT < 34) {
                switch (i3) {
                    case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    case 23:
                    case 26:
                        i2 = 6;
                        break;
                    case 22:
                    case 24:
                    case 27:
                        i2 = 4;
                        break;
                }
            }
            i2 = i3;
        }
        if (i2 == -1) {
            return;
        }
        this.a.performHapticFeedback(i2);
    }
}
