package defpackage;

import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class bd0 {
    public static final int API_PRIORITY_GAMES = 1;
    public static final int API_PRIORITY_OTHER = Integer.MAX_VALUE;
    public static final int API_PRIORITY_PLUS = 2;

    public List<Scope> getImpliedScopes(Object obj) {
        return Collections.EMPTY_LIST;
    }

    public int getPriority() {
        return API_PRIORITY_OTHER;
    }
}
