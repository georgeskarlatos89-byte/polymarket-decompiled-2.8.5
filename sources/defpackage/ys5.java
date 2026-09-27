package defpackage;

import java.util.Date;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class ys5 {
    public static Long a(Date date) {
        if (date != null) {
            return Long.valueOf(date.getTime());
        }
        return null;
    }

    public static Date b(Long l) {
        if (l != null) {
            return new Date(l.longValue());
        }
        return null;
    }
}
