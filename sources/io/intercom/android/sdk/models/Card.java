package io.intercom.android.sdk.models;

import io.intercom.android.sdk.blocks.lib.models.Author;
import io.intercom.android.sdk.utilities.NullSafety;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class Card {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public static final class Builder {
        String articleId;
        Author.Builder author;
        String description;
        String linkType;
        String text;
        String title;
        String type;

        public Card build() {
            Author.Builder builder = this.author;
            if (builder == null) {
                builder = new Author.Builder();
            }
            return Card.create(NullSafety.valueOrEmpty(this.type), NullSafety.valueOrEmpty(this.text), NullSafety.valueOrEmpty(this.title), NullSafety.valueOrEmpty(this.description), builder.build());
        }
    }

    public static Card create(String str, String str2, String str3, String str4, Author author) {
        return new AutoValue_Card(str, str2, str3, str4, author);
    }

    public abstract Author getAuthor();

    public abstract String getDescription();

    public abstract String getText();

    public abstract String getTitle();

    public abstract String getType();
}
