package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class p2a extends qd0 {
    public final Throwable b;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p2a(int i, Throwable th) {
        super(new Status(i, "Integrity API error (" + i + "): " + r1 + ".", null, null));
        String str;
        Locale locale = Locale.ROOT;
        HashMap hashMap = tsk.a;
        Integer valueOf = Integer.valueOf(i);
        if (hashMap.containsKey(valueOf)) {
            HashMap hashMap2 = tsk.b;
            if (hashMap2.containsKey(valueOf)) {
                str = ((String) hashMap.get(valueOf)) + " (https://developer.android.com/google/play/integrity/reference/com/google/android/play/core/integrity/model/IntegrityErrorCode.html#" + ((String) hashMap2.get(valueOf)) + ")";
                if (i == 0) {
                    this.b = th;
                    return;
                } else {
                    dmk.v("ErrorCode should not be 0.");
                    throw null;
                }
            }
        }
        str = "";
        if (i == 0) {
        }
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.b;
    }
}
