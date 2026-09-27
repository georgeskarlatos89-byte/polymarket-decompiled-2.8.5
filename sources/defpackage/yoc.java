package defpackage;

import io.getstream.chat.android.models.DraftMessage;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class yoc {
    public final String a;
    public final Function0 b;
    public uwh c;
    public uwh d;
    public uwh e;
    public uwh f;
    public uwh g;
    public uwh h;
    public uwh i;
    public uwh j;
    public uwh k;
    public uwh l;
    public uwh m;
    public final uwh n;
    public final uwh o;
    public final uwh p;
    public final uwh q;
    public final uwh r;
    public final uwh s;
    public final uwh t;
    public final uwh u;

    public yoc(String str) {
        xoc xocVar = xoc.f;
        str.getClass();
        this.a = str;
        this.b = xocVar;
        this.c = n0n.a(0);
        this.d = n0n.a(0);
        zc7 zc7Var = zc7.a;
        zc7Var.getClass();
        this.e = n0n.a(zc7Var);
        this.f = n0n.a(0);
        this.g = n0n.a(Boolean.FALSE);
        this.h = n0n.a(CollectionsKt.emptyList());
        this.i = n0n.a(CollectionsKt.emptyList());
        this.j = n0n.a(CollectionsKt.emptyList());
        this.k = n0n.a(zc7Var);
        this.l = n0n.a(zc7Var);
        this.m = n0n.a(zc7Var);
        uwh a = n0n.a(CollectionsKt.emptyList());
        this.n = a;
        uwh uwhVar = this.c;
        uwhVar.getClass();
        this.o = uwhVar;
        uwh uwhVar2 = this.d;
        uwhVar2.getClass();
        this.p = uwhVar2;
        uwh uwhVar3 = this.e;
        uwhVar3.getClass();
        this.q = uwhVar3;
        uwh uwhVar4 = this.f;
        uwhVar4.getClass();
        this.r = uwhVar4;
        uwh uwhVar5 = this.h;
        uwhVar5.getClass();
        this.s = uwhVar5;
        this.i.getClass();
        uwh uwhVar6 = this.j;
        uwhVar6.getClass();
        this.t = uwhVar6;
        this.g.getClass();
        this.k.getClass();
        this.l.getClass();
        this.m.getClass();
        this.u = a;
        ewn.e(a, new woc(this, 1));
    }

    public final void a(List list) {
        uwh uwhVar;
        Object value;
        Sequence g;
        list.getClass();
        do {
            uwhVar = this.n;
            value = uwhVar.getValue();
            g = ArraysKt.g(new Sequence[]{new r18(CollectionsKt.r((List) value), false, new na3(list, 4)), new tl0(list, 1)});
            g.getClass();
        } while (!uwhVar.k(value, pwg.q(new xs8(new r18(lwg.d(g, new zog(19)), true, new woc(this, 0)), new tv4(16), 1))));
    }

    public final void b(DraftMessage draftMessage) {
        uwh uwhVar;
        draftMessage.getClass();
        String parentId = draftMessage.getParentId();
        if (parentId != null && (uwhVar = this.m) != null) {
            uwhVar.l(d1c.k((Map) uwhVar.getValue(), new Pair(parentId, draftMessage)));
        }
        uwh uwhVar2 = this.l;
        if (uwhVar2 != null) {
            if (draftMessage.getParentId() != null) {
                uwhVar2 = null;
            }
            if (uwhVar2 != null) {
                uwhVar2.l(d1c.k((Map) uwhVar2.getValue(), new Pair(draftMessage.getCid(), draftMessage)));
            }
        }
    }
}
