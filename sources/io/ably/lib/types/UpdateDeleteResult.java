package io.ably.lib.types;

import io.ably.lib.http.HttpCore;
import io.ably.lib.util.Serialisation;
import java.io.IOException;
import org.msgpack.core.MessageFormat;
import org.msgpack.core.MessageUnpacker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public class UpdateDeleteResult {
    private static final String VERSION_SERIAL = "versionSerial";
    public final String versionSerial;

    public UpdateDeleteResult(String str) {
        this.versionSerial = str;
    }

    public static /* synthetic */ UpdateDeleteResult access$100(byte[] bArr) {
        return readFromJson(bArr);
    }

    public static /* synthetic */ UpdateDeleteResult access$200(byte[] bArr) {
        return readMsgpack(bArr);
    }

    public static HttpCore.BodyHandler<UpdateDeleteResult> getBodyHandler() {
        return new UpdateDeleteResultBodyHandler(null);
    }

    private static UpdateDeleteResult readFromJson(byte[] bArr) {
        return (UpdateDeleteResult) Serialisation.gson.fromJson(new String(bArr), UpdateDeleteResult.class);
    }

    private static UpdateDeleteResult readMsgpack(MessageUnpacker messageUnpacker) {
        int unpackMapHeader = messageUnpacker.unpackMapHeader();
        String str = null;
        for (int i = 0; i < unpackMapHeader; i++) {
            String intern = messageUnpacker.unpackString().intern();
            if (messageUnpacker.getNextFormat().equals(MessageFormat.NIL)) {
                messageUnpacker.unpackNil();
            } else if (intern.equals(VERSION_SERIAL)) {
                str = messageUnpacker.unpackString();
            } else {
                messageUnpacker.skipValue();
            }
        }
        return new UpdateDeleteResult(str);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes5.dex */
    public static class UpdateDeleteResultBodyHandler implements HttpCore.BodyHandler<UpdateDeleteResult> {
        private UpdateDeleteResultBodyHandler() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ably.lib.http.HttpCore.BodyHandler
        public UpdateDeleteResult[] handleResponseBody(String str, byte[] bArr) {
            UpdateDeleteResult updateDeleteResult;
            try {
                if ("application/json".equals(str)) {
                    updateDeleteResult = UpdateDeleteResult.access$100(bArr);
                } else if ("application/x-msgpack".equals(str)) {
                    updateDeleteResult = UpdateDeleteResult.access$200(bArr);
                } else {
                    updateDeleteResult = null;
                }
                return new UpdateDeleteResult[]{updateDeleteResult};
            } catch (MessageDecodeException e) {
                throw AblyException.fromThrowable(e);
            }
        }

        public /* synthetic */ UpdateDeleteResultBodyHandler(AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // io.ably.lib.http.HttpCore.BodyHandler
        public /* bridge */ /* synthetic */ UpdateDeleteResult[] handleResponseBody(String str, byte[] bArr) {
            return handleResponseBody(str, bArr);
        }
    }

    private static UpdateDeleteResult readMsgpack(byte[] bArr) {
        try {
            return readMsgpack(Serialisation.msgpackUnpackerConfig.newUnpacker(bArr));
        } catch (IOException e) {
            throw AblyException.fromThrowable(e);
        }
    }
}
