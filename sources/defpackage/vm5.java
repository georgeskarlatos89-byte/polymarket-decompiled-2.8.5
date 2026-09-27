package defpackage;

import java.util.LinkedHashSet;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lvm5;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class vm5 extends RuntimeException {
    public final LinkedHashSet a;

    public vm5(LinkedHashSet linkedHashSet) {
        this.a = linkedHashSet;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Detected a cycle between flags " + this.a;
    }
}
