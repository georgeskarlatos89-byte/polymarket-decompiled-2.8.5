package defpackage;

import com.polymarket.clients.ClientChatMessage;
import com.polymarket.clients.ClientChatMessageReaction;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class eq3 implements Function1 {
    public final /* synthetic */ ClientChatMessage a;
    public final /* synthetic */ qqc b;

    public eq3(ClientChatMessage clientChatMessage, qqc qqcVar) {
        this.a = clientChatMessage;
        this.b = qqcVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ClientChatMessageReaction.ReactionContent reactionContent = (ClientChatMessageReaction.ReactionContent) obj;
        reactionContent.getClass();
        this.b.setValue(new Pair(this.a, reactionContent));
        return Unit.INSTANCE;
    }
}
