package defpackage;

import com.polymarket.clients.ClientChatMessage;
import com.polymarket.clients.ClientChatMessageReaction;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class bq3 implements Function2 {
    public final /* synthetic */ qqc a;

    public bq3(qqc qqcVar) {
        this.a = qqcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ClientChatMessage clientChatMessage = (ClientChatMessage) obj;
        ClientChatMessageReaction.ReactionContent reactionContent = (ClientChatMessageReaction.ReactionContent) obj2;
        clientChatMessage.getClass();
        reactionContent.getClass();
        this.a.setValue(new Pair(clientChatMessage, reactionContent));
        return Unit.INSTANCE;
    }
}
