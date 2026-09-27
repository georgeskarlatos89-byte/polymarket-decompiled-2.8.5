package io.getstream.chat.android.network.models;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import defpackage.ah3;
import defpackage.bh3;
import defpackage.dp8;
import defpackage.wga;
import defpackage.x3j;
import defpackage.yg3;
import defpackage.zg3;
import io.getstream.chat.android.models.ChannelCapabilities;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"io/getstream/chat/android/network/models/ChannelOwnCapability$ChannelOwnCapabilityAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lbh3;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lbh3;", "Lwga;", "writer", "value", "", "toJson", "(Lwga;Lbh3;)V", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChannelOwnCapability$ChannelOwnCapabilityAdapter extends JsonAdapter<bh3> {
    @Override // com.squareup.moshi.JsonAdapter
    @dp8
    public bh3 fromJson(JsonReader reader) {
        reader.getClass();
        String nextString = reader.nextString();
        if (nextString == null) {
            return null;
        }
        switch (nextString.hashCode()) {
            case -2132808044:
                if (nextString.equals("create-attachment")) {
                    return yg3.e;
                }
                break;
            case -2050818741:
                if (nextString.equals(ChannelCapabilities.UPDATE_CHANNEL_MEMBERS)) {
                    return zg3.j;
                }
                break;
            case -2028654641:
                if (nextString.equals(ChannelCapabilities.PIN_MESSAGE)) {
                    return yg3.t;
                }
                break;
            case -1972209878:
                if (nextString.equals(ChannelCapabilities.CAST_POLL_VOTE)) {
                    return yg3.c;
                }
                break;
            case -1929067985:
                if (nextString.equals(ChannelCapabilities.TYPING_EVENTS)) {
                    return zg3.g;
                }
                break;
            case -1886929119:
                if (nextString.equals(ChannelCapabilities.SKIP_SLOW_MODE)) {
                    return zg3.e;
                }
                break;
            case -1865307454:
                if (nextString.equals(ChannelCapabilities.SEND_MESSAGE)) {
                    return yg3.A;
                }
                break;
            case -1809860954:
                if (nextString.equals(ChannelCapabilities.FLAG_MESSAGE)) {
                    return yg3.k;
                }
                break;
            case -1789165580:
                if (nextString.equals(ChannelCapabilities.NOTIFY_HERE)) {
                    return yg3.r;
                }
                break;
            case -1788858246:
                if (nextString.equals(ChannelCapabilities.NOTIFY_ROLE)) {
                    return yg3.s;
                }
                break;
            case -1702950931:
                if (nextString.equals(ChannelCapabilities.LEAVE_CHANNEL)) {
                    return yg3.n;
                }
                break;
            case -1633435649:
                if (nextString.equals(ChannelCapabilities.UPDATE_CHANNEL)) {
                    return zg3.i;
                }
                break;
            case -1369643495:
                if (nextString.equals(ChannelCapabilities.CREATE_MENTION)) {
                    return yg3.f;
                }
                break;
            case -1277648528:
                if (nextString.equals(ChannelCapabilities.SEND_CUSTOM_EVENTS)) {
                    return yg3.y;
                }
                break;
            case -718809252:
                if (nextString.equals(ChannelCapabilities.CONNECT_EVENTS)) {
                    return yg3.d;
                }
                break;
            case -610570956:
                if (nextString.equals(ChannelCapabilities.SEND_LINKS)) {
                    return yg3.z;
                }
                break;
            case -605147035:
                if (nextString.equals(ChannelCapabilities.SEND_REPLY)) {
                    return yg3.D;
                }
                break;
            case -559636865:
                if (nextString.equals(ChannelCapabilities.NOTIFY_CHANNEL)) {
                    return yg3.p;
                }
                break;
            case -261616927:
                if (nextString.equals(ChannelCapabilities.DELETE_CHANNEL)) {
                    return yg3.h;
                }
                break;
            case -233797297:
                if (nextString.equals(ChannelCapabilities.MUTE_CHANNEL)) {
                    return yg3.o;
                }
                break;
            case -141221884:
                if (nextString.equals(ChannelCapabilities.DELETE_ANY_MESSAGE)) {
                    return yg3.g;
                }
                break;
            case -19570972:
                if (nextString.equals(ChannelCapabilities.SEND_POLL)) {
                    return yg3.B;
                }
                break;
            case 116843958:
                if (nextString.equals(ChannelCapabilities.QUOTE_MESSAGE)) {
                    return yg3.v;
                }
                break;
            case 143988258:
                if (nextString.equals(ChannelCapabilities.UPDATE_ANY_MESSAGE)) {
                    return zg3.h;
                }
                break;
            case 227933137:
                if (nextString.equals(ChannelCapabilities.SEARCH_MESSAGES)) {
                    return yg3.x;
                }
                break;
            case 350188384:
                if (nextString.equals(ChannelCapabilities.JOIN_CHANNEL)) {
                    return yg3.m;
                }
                break;
            case 369903355:
                if (nextString.equals(ChannelCapabilities.NOTIFY_GROUP)) {
                    return yg3.q;
                }
                break;
            case 424735889:
                if (nextString.equals(ChannelCapabilities.BAN_CHANNEL_MEMBERS)) {
                    return yg3.b;
                }
                break;
            case 515476345:
                if (nextString.equals("send-restricted-visibility-message")) {
                    return yg3.E;
                }
                break;
            case 522556690:
                if (nextString.equals(ChannelCapabilities.DELIVERY_EVENTS)) {
                    return yg3.j;
                }
                break;
            case 726567407:
                if (nextString.equals(ChannelCapabilities.SLOW_MODE)) {
                    return zg3.f;
                }
                break;
            case 1018405320:
                if (nextString.equals(ChannelCapabilities.UPLOAD_FILE)) {
                    return zg3.m;
                }
                break;
            case 1254775552:
                if (nextString.equals(ChannelCapabilities.SET_CHANNEL_COOLDOWN)) {
                    return zg3.c;
                }
                break;
            case 1404771230:
                if (nextString.equals(ChannelCapabilities.DELETE_OWN_MESSAGE)) {
                    return yg3.i;
                }
                break;
            case 1420301261:
                if (nextString.equals(ChannelCapabilities.FREEZE_CHANNEL)) {
                    return yg3.l;
                }
                break;
            case 1542880142:
                if (nextString.equals("update-thread")) {
                    return zg3.l;
                }
                break;
            case 1689981372:
                if (nextString.equals(ChannelCapabilities.UPDATE_OWN_MESSAGE)) {
                    return zg3.k;
                }
                break;
            case 1712927072:
                if (nextString.equals("query-poll-votes")) {
                    return yg3.u;
                }
                break;
            case 1743860906:
                if (nextString.equals(ChannelCapabilities.SEND_TYPING_EVENTS)) {
                    return zg3.b;
                }
                break;
            case 1882529072:
                if (nextString.equals(ChannelCapabilities.READ_EVENTS)) {
                    return yg3.w;
                }
                break;
            case 1899595470:
                if (nextString.equals(ChannelCapabilities.SEND_REACTION)) {
                    return yg3.C;
                }
                break;
            case 1985232355:
                if (nextString.equals("share-location")) {
                    return zg3.d;
                }
                break;
        }
        return new ah3(nextString);
    }

    @x3j
    public void toJson(wga writer, bh3 value) {
        String str;
        writer.getClass();
        if (value != null) {
            str = value.a;
        } else {
            str = null;
        }
        writer.a0(str);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final /* bridge */ /* synthetic */ void toJson(wga wgaVar, Object obj) {
        toJson(wgaVar, (bh3) obj);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader) {
        return fromJson(jsonReader);
    }
}
