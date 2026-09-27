package org.msgpack.core;

import java.nio.charset.CharacterCodingException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class MessageStringCodingException extends MessagePackException {
    public MessageStringCodingException(String str, CharacterCodingException characterCodingException) {
        super(str, characterCodingException);
    }

    @Override // java.lang.Throwable
    public CharacterCodingException getCause() {
        return (CharacterCodingException) super.getCause();
    }

    public MessageStringCodingException(CharacterCodingException characterCodingException) {
        super(characterCodingException);
    }

    @Override // java.lang.Throwable
    public /* bridge */ /* synthetic */ Throwable getCause() {
        return getCause();
    }
}
