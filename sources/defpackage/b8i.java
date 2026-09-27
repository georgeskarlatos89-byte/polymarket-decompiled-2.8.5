package defpackage;

import com.stripe.android.model.StripeIntent$Usage;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class b8i {
    public static StripeIntent$Usage a(String str) {
        Object obj;
        Iterator<E> it = StripeIntent$Usage.b().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.areEqual(((StripeIntent$Usage) obj).getCode(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (StripeIntent$Usage) obj;
    }
}
