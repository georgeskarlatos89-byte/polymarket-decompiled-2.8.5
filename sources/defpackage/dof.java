package defpackage;

import io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionDao_Impl;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class dof implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ReactionDao_Impl b;
    public final /* synthetic */ hof c;

    public /* synthetic */ dof(ReactionDao_Impl reactionDao_Impl, hof hofVar, int i) {
        this.a = i;
        this.b = reactionDao_Impl;
        this.c = hofVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        hof hofVar = this.c;
        ReactionDao_Impl reactionDao_Impl = this.b;
        fcg fcgVar = (fcg) obj;
        switch (i) {
            case 0:
                return ReactionDao_Impl.e(reactionDao_Impl, hofVar, fcgVar);
            default:
                return ReactionDao_Impl.a(reactionDao_Impl, hofVar, fcgVar);
        }
    }
}
