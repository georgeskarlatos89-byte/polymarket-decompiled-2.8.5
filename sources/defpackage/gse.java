package defpackage;

import android.view.MotionEvent;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class gse {
    public final List a;
    public final s8h b;
    public final int c;
    public final int d;
    public final int e;
    public int f;

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
    
        if (r4 != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
    
        r0 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        if (r4 != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0084, code lost:
    
        if (r4 != false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gse(List list, s8h s8hVar) {
        int i;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        this.a = list;
        this.b = s8hVar;
        MotionEvent a = a();
        int i4 = 0;
        if (a != null) {
            i = a.getClassification();
        } else {
            i = 0;
        }
        this.c = i;
        MotionEvent a2 = a();
        if (a2 != null) {
            i2 = a2.getButtonState();
        } else {
            i2 = 0;
        }
        this.d = i2;
        MotionEvent a3 = a();
        if (a3 != null) {
            i3 = a3.getMetaState();
        } else {
            i3 = 0;
        }
        this.e = i3;
        MotionEvent a4 = a();
        if (a4 != null) {
            if (a4.getClassification() == 3) {
                z = true;
            } else {
                z = false;
            }
            if (a4.getClassification() == 5) {
                z2 = true;
            } else {
                z2 = false;
            }
            int actionMasked = a4.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 5:
                                if (!z) {
                                }
                                i4 = 10;
                                break;
                            case 6:
                                if (!z) {
                                }
                                i4 = 12;
                                break;
                            case 8:
                                i4 = 6;
                                break;
                            case 9:
                                i4 = 4;
                                break;
                            case 10:
                                i4 = 5;
                                break;
                        }
                    }
                    if (z) {
                        i4 = 11;
                    }
                } else {
                    if (!z) {
                        if (z2) {
                            i4 = 9;
                        }
                        i4 = 2;
                    }
                    i4 = 12;
                }
            } else {
                if (!z) {
                    if (z2) {
                        i4 = 7;
                    }
                    i4 = 1;
                }
                i4 = 10;
            }
        } else {
            int size = list.size();
            while (i4 < size) {
                nse nseVar = (nse) list.get(i4);
                if (hqn.d(nseVar)) {
                    i4 = 2;
                } else if (hqn.b(nseVar)) {
                    i4 = 1;
                } else {
                    i4++;
                }
            }
            i4 = 3;
        }
        this.f = i4;
    }

    public final MotionEvent a() {
        s8h s8hVar = this.b;
        if (s8hVar != null) {
            return (MotionEvent) ((qje) s8hVar.d).c;
        }
        return null;
    }
}
