package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import com.fingerprintjs.android.fpjs_pro.g;
import io.ably.lib.util.AgentHeaderCreator;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class sen {
    public Object a;
    public Object b = "files";
    public Object c = "common";
    public Object d = xpn.b;
    public Object e = "";
    public Object f = jr9.k();

    public /* synthetic */ sen(Context context) {
        this.a = context.getPackageName();
    }

    public void a(String str) {
        chn.c(xpn.a.matcher(str).matches(), "Module must match [a-z]+(_[a-z]+)*: %s", str);
        chn.c(!xpn.c.contains(str), "Module name is reserved and cannot be used: %s", str);
        this.c = str;
    }

    public void b(String str) {
        if (str.startsWith(AgentHeaderCreator.AGENT_DIVIDER)) {
            str = str.substring(1);
        }
        Pattern pattern = xpn.a;
        this.e = str;
    }

    public Uri c() {
        boolean z;
        boolean z2;
        boolean z3;
        String p;
        String concat;
        String str = (String) this.b;
        String str2 = (String) this.c;
        Account account = dpn.a;
        Account account2 = (Account) this.d;
        if (account2.type.indexOf(58) == -1) {
            z = true;
        } else {
            z = false;
        }
        chn.c(z, "Account type contains ':'.", new Object[0]);
        if (account2.type.indexOf(47) == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        chn.c(z2, "Account type contains '/'.", new Object[0]);
        if (account2.name.indexOf(47) == -1) {
            z3 = true;
        } else {
            z3 = false;
        }
        chn.c(z3, "Account name contains '/'.", new Object[0]);
        if (dpn.a.equals(account2)) {
            p = "shared";
        } else {
            String str3 = account2.type;
            String str4 = account2.name;
            p = ix2.p(new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length()), str3, ":", str4);
        }
        String str5 = (String) this.e;
        StringBuilder sb = new StringBuilder(g.d(g.d(str.length() + 2, 1, str2), 1, p) + str5.length());
        k84.q(sb, AgentHeaderCreator.AGENT_DIVIDER, str, AgentHeaderCreator.AGENT_DIVIDER, str2);
        String p2 = sv6.p(sb, AgentHeaderCreator.AGENT_DIVIDER, p, AgentHeaderCreator.AGENT_DIVIDER, str5);
        wwf g = ((dr9) this.f).g();
        Pattern pattern = yrn.a;
        if (g.isEmpty()) {
            concat = null;
        } else {
            concat = "transform=".concat(new wca("+").c(g));
        }
        return new Uri.Builder().scheme("android").authority((String) this.a).path(p2).encodedFragment(concat).build();
    }
}
