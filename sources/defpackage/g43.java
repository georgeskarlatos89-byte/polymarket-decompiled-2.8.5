package defpackage;

import bo.app.v9;
import bo.app.w3;
import bo.app.x3;
import bo.app.y3;
import bo.app.z9;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class g43 implements yj9 {
    public final JSONObject a;
    public final v9 b;
    public final vi9 c;
    public final z9 d;
    public final Map e;
    public final String f;
    public final long g;
    public final long h;
    public final boolean i;
    public final boolean j;
    public boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public boolean o;
    public boolean p;
    public boolean q;

    static {
        new w3();
    }

    public g43(JSONObject jSONObject, v9 v9Var, vi9 vi9Var, z9 z9Var) {
        this.a = jSONObject;
        this.b = v9Var;
        this.c = vi9Var;
        this.d = z9Var;
        this.e = qga.b(jSONObject.optJSONObject(y63.EXTRAS.b()));
        String string = jSONObject.getString(y63.ID.b());
        string.getClass();
        this.f = string;
        e93 e93Var = f93.Companion;
        this.o = jSONObject.optBoolean(y63.VIEWED.b());
        this.q = jSONObject.optBoolean(y63.DISMISSED.b(), false);
        this.j = jSONObject.optBoolean(y63.PINNED.b(), false);
        this.g = jSONObject.getLong(y63.CREATED.b());
        this.h = jSONObject.optLong(y63.EXPIRES_AT.b(), -1L);
        this.l = jSONObject.optBoolean(y63.OPEN_URI_IN_WEBVIEW.b(), false);
        this.i = jSONObject.optBoolean(y63.REMOVED.b(), false);
        this.m = jSONObject.optBoolean(y63.DISMISSIBLE.b(), false);
        this.p = jSONObject.optBoolean(y63.READ.b(), this.o);
        this.k = jSONObject.optBoolean(y63.CLICKED.b(), false);
        this.n = jSONObject.optBoolean(y63.IS_TEST.b(), false);
    }

    public abstract f93 b();

    public String c() {
        return null;
    }

    public final boolean d() {
        if (StringsKt.T(this.f)) {
            b69.h(this, pm1.W, null, false, new us1(22), 6);
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && Intrinsics.areEqual(getClass(), obj.getClass())) {
                g43 g43Var = (g43) obj;
                if (this.g == g43Var.g && Intrinsics.areEqual(this.f, g43Var.f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.yj9
    public final Object forJsonPut() {
        return this.a;
    }

    public final boolean h() {
        if (!d()) {
            return false;
        }
        coc.c(tl1.a, null, null, new y3(this, this.d, this.c, this.b, null), 3);
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f.hashCode() * 31;
        long j = this.g;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public final boolean i() {
        this.k = true;
        if (!d()) {
            return false;
        }
        coc.c(tl1.a, null, null, new x3(this.d, this, this.c, this.b, null), 3);
        return true;
    }

    public final void j() {
        this.p = true;
        try {
            this.c.markCardAsVisuallyRead(this.f);
        } catch (Exception e) {
            b69.h(this, pm1.D, e, false, new us1(21), 4);
        }
    }

    public String toString() {
        return c.c("\n        Card{\n        extras=" + this.e + "\n        id='" + this.f + "'\n        created=" + this.g + "\n        expiresAt=" + this.h + "\n        viewed=" + this.o + "\n        isRead=" + this.p + "\n        isDismissed=" + this.q + "\n        isRemoved=" + this.i + "\n        isPinned=" + this.j + "\n        isClicked=" + this.k + "\n        openUriInWebview=" + this.l + "\n        isDismissibleByUser=" + this.m + "\n        isTest=" + this.n + "\n        json=" + qga.e(this.a) + "\n        }\n\n        ");
    }
}
