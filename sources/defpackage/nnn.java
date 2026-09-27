package defpackage;

import com.polymarket.clients.ClientChatMessage;
import com.polymarket.clients.ClientChatMessageContentType;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract class nnn implements xic {
    public static final boolean a(ClientChatMessage clientChatMessage) {
        ClientChatMessageContentType content = clientChatMessage.getContent();
        if (!(content instanceof ClientChatMessageContentType.PlayByPlayCase) && !(content instanceof ClientChatMessageContentType.GameTimelineCase) && !(content instanceof ClientChatMessageContentType.SquadStatusCase) && !(content instanceof ClientChatMessageContentType.SquadPositionCase)) {
            return true;
        }
        return false;
    }
}
