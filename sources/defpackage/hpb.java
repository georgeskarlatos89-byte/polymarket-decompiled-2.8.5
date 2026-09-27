package defpackage;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class hpb {
    public final Locale a;

    public hpb(Locale locale) {
        this.a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof hpb)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return Intrinsics.areEqual(this.a.toLanguageTag(), ((hpb) obj).a.toLanguageTag());
    }

    public final int hashCode() {
        return this.a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.a.toLanguageTag();
    }
}
