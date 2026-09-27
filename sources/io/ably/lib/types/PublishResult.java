package io.ably.lib.types;

import defpackage.omf;
import io.ably.lib.http.HttpCore;
import io.ably.lib.util.Serialisation;
import java.io.IOException;
import org.msgpack.core.MessageFormat;
import org.msgpack.core.MessagePacker;
import org.msgpack.core.MessageUnpacker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public class PublishResult {
    private static final String SERIALS = "serials";
    public final String[] serials;

    public PublishResult(String[] strArr) {
        this.serials = strArr;
    }

    public static /* synthetic */ PublishResult access$100(byte[] bArr) {
        return readFromJson(bArr);
    }

    public static /* synthetic */ PublishResult access$200(byte[] bArr) {
        return readMsgpack(bArr);
    }

    public static HttpCore.BodyHandler<String> getBodyHandler() {
        return new PublishResultBodyHandler(null);
    }

    private static PublishResult readFromJson(byte[] bArr) {
        return (PublishResult) Serialisation.gson.fromJson(new String(bArr), PublishResult.class);
    }

    private static PublishResult readMsgpack(MessageUnpacker messageUnpacker) {
        int unpackMapHeader = messageUnpacker.unpackMapHeader();
        for (int i = 0; i < unpackMapHeader; i++) {
            String unpackString = messageUnpacker.unpackString();
            if (messageUnpacker.getNextFormat().equals(MessageFormat.NIL)) {
                messageUnpacker.unpackNil();
            } else {
                if (unpackString.equals(SERIALS)) {
                    int unpackArrayHeader = messageUnpacker.unpackArrayHeader();
                    String[] strArr = new String[unpackArrayHeader];
                    for (int i2 = 0; i2 < unpackArrayHeader; i2++) {
                        if (messageUnpacker.getNextFormat().equals(MessageFormat.NIL)) {
                            messageUnpacker.unpackNil();
                            strArr[i2] = null;
                        } else {
                            strArr[i2] = messageUnpacker.unpackString();
                        }
                    }
                    return new PublishResult(strArr);
                }
                messageUnpacker.skipValue();
            }
        }
        return new PublishResult(new String[0]);
    }

    public static PublishResult[] readMsgpackArray(MessageUnpacker messageUnpacker) {
        int unpackArrayHeader = messageUnpacker.unpackArrayHeader();
        PublishResult[] publishResultArr = new PublishResult[unpackArrayHeader];
        for (int i = 0; i < unpackArrayHeader; i++) {
            publishResultArr[i] = readMsgpack(messageUnpacker);
        }
        return publishResultArr;
    }

    private void writeMsgpack(MessagePacker messagePacker) {
        int i;
        if (this.serials != null) {
            i = 1;
        } else {
            i = 0;
        }
        messagePacker.packMapHeader(i);
        if (this.serials != null) {
            messagePacker.packString(SERIALS);
            messagePacker.packArrayHeader(this.serials.length);
            for (String str : this.serials) {
                if (str == null) {
                    messagePacker.packNil();
                } else {
                    messagePacker.packString(str);
                }
            }
        }
    }

    public static void writeMsgpackArray(PublishResult[] publishResultArr, MessagePacker messagePacker) {
        try {
            messagePacker.packArrayHeader(publishResultArr.length);
            for (PublishResult publishResult : publishResultArr) {
                if (publishResult != null) {
                    publishResult.writeMsgpack(messagePacker);
                } else {
                    messagePacker.packNil();
                }
            }
        } catch (IOException e) {
            omf.m(e.getMessage(), e);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes5.dex */
    public static class PublishResultBodyHandler implements HttpCore.BodyHandler<String> {
        private PublishResultBodyHandler() {
        }

        @Override // io.ably.lib.http.HttpCore.BodyHandler
        /* renamed from: handleResponseBody, reason: avoid collision after fix types in other method */
        public String[] handleResponseBody2(String str, byte[] bArr) {
            PublishResult publishResult;
            try {
                if ("application/json".equals(str)) {
                    publishResult = PublishResult.access$100(bArr);
                } else if ("application/x-msgpack".equals(str)) {
                    publishResult = PublishResult.access$200(bArr);
                } else {
                    publishResult = null;
                }
                if (publishResult != null) {
                    return publishResult.serials;
                }
                return new String[0];
            } catch (MessageDecodeException e) {
                throw AblyException.fromThrowable(e);
            }
        }

        public /* synthetic */ PublishResultBodyHandler(AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // io.ably.lib.http.HttpCore.BodyHandler
        public /* bridge */ /* synthetic */ String[] handleResponseBody(String str, byte[] bArr) {
            return handleResponseBody2(str, bArr);
        }
    }

    private static PublishResult readMsgpack(byte[] bArr) {
        try {
            return readMsgpack(Serialisation.msgpackUnpackerConfig.newUnpacker(bArr));
        } catch (IOException e) {
            throw AblyException.fromThrowable(e);
        }
    }
}
