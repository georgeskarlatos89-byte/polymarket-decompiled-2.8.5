package defpackage;

import com.stripe.android.model.ConsumerSession$AuthenticationLevel;
import java.util.Iterator;
import kotlin.text.e;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class h15 {
    public static ConsumerSession$AuthenticationLevel a(String str) {
        Object obj;
        Iterator<E> it = ConsumerSession$AuthenticationLevel.getEntries().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (e.o(((ConsumerSession$AuthenticationLevel) obj).getValue(), str, true)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        ConsumerSession$AuthenticationLevel consumerSession$AuthenticationLevel = (ConsumerSession$AuthenticationLevel) obj;
        if (consumerSession$AuthenticationLevel == null) {
            return ConsumerSession$AuthenticationLevel.Unknown;
        }
        return consumerSession$AuthenticationLevel;
    }

    public final KSerializer serializer() {
        return (KSerializer) ConsumerSession$AuthenticationLevel.access$get$cachedSerializer$delegate$cp().getValue();
    }
}
