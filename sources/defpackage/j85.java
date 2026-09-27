package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.ServiceConfigurationError;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class j85 {
    public static final Collection a;

    static {
        try {
            a = pwg.q(lwg.b(Arrays.asList(new m20()).iterator()));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
