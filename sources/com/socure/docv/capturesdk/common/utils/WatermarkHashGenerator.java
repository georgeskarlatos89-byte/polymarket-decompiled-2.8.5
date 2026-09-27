package com.socure.docv.capturesdk.common.utils;

import defpackage.ace;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.text.Charsets;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0002J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002J \u0010\r\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\bH\u0002¨\u0006\u0010"}, d2 = {"Lcom/socure/docv/capturesdk/common/utils/WatermarkHashGenerator;", "", "<init>", "()V", "processImage", "", "imageBytes", "sessionToken", "", "moduleId", "nonce", "injectHash", "hash", "generateHashPayload", "generateHash", MetricTracker.Object.INPUT, "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WatermarkHashGenerator {
    public static final int $stable = 0;
    public static final WatermarkHashGenerator INSTANCE = new WatermarkHashGenerator();

    private WatermarkHashGenerator() {
    }

    private final byte[] generateHash(String input) {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = input.getBytes(Charsets.UTF_8);
        bytes.getClass();
        byte[] digest = messageDigest.digest(bytes);
        digest.getClass();
        return digest;
    }

    private final byte[] generateHashPayload(String sessionToken, String moduleId, String nonce) {
        return generateHash(sessionToken + "-" + moduleId + "-" + nonce);
    }

    private final byte[] injectHash(byte[] imageBytes, byte[] hash) {
        int length = imageBytes.length;
        byte[] array = ByteBuffer.allocate(length + 36).put(imageBytes, 0, length - 2).put((byte) -1).put((byte) -30).put((byte) 0).put((byte) 34).put(hash).put((byte) -1).put(MessagePack.Code.STR8).array();
        array.getClass();
        return array;
    }

    public final byte[] processImage(byte[] imageBytes, String sessionToken, String moduleId, String nonce) {
        imageBytes.getClass();
        sessionToken.getClass();
        moduleId.getClass();
        nonce.getClass();
        return injectHash(imageBytes, generateHashPayload(sessionToken, moduleId, nonce));
    }

    public final byte[] processImage(byte[] imageBytes, String sessionToken, String moduleId) {
        imageBytes.getClass();
        sessionToken.getClass();
        moduleId.getClass();
        return injectHash(imageBytes, generateHashPayload(sessionToken, moduleId));
    }

    private final byte[] generateHashPayload(String sessionToken, String moduleId) {
        return generateHash(ace.m(sessionToken, "-", moduleId));
    }
}
