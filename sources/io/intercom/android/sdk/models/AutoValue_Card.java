package io.intercom.android.sdk.models;

import defpackage.dmk;
import io.intercom.android.sdk.blocks.lib.models.Author;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
final class AutoValue_Card extends Card {
    private final Author author;
    private final String description;
    private final String text;
    private final String title;
    private final String type;

    public AutoValue_Card(String str, String str2, String str3, String str4, Author author) {
        if (str != null) {
            this.type = str;
            if (str2 != null) {
                this.text = str2;
                if (str3 != null) {
                    this.title = str3;
                    if (str4 != null) {
                        this.description = str4;
                        if (author != null) {
                            this.author = author;
                            return;
                        } else {
                            dmk.s("Null author");
                            throw null;
                        }
                    }
                    dmk.s("Null description");
                    throw null;
                }
                dmk.s("Null title");
                throw null;
            }
            dmk.s("Null text");
            throw null;
        }
        dmk.s("Null type");
        throw null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Card) {
            Card card = (Card) obj;
            if (this.type.equals(card.getType()) && this.text.equals(card.getText()) && this.title.equals(card.getTitle()) && this.description.equals(card.getDescription()) && this.author.equals(card.getAuthor())) {
                return true;
            }
        }
        return false;
    }

    @Override // io.intercom.android.sdk.models.Card
    public Author getAuthor() {
        return this.author;
    }

    @Override // io.intercom.android.sdk.models.Card
    public String getDescription() {
        return this.description;
    }

    @Override // io.intercom.android.sdk.models.Card
    public String getText() {
        return this.text;
    }

    @Override // io.intercom.android.sdk.models.Card
    public String getTitle() {
        return this.title;
    }

    @Override // io.intercom.android.sdk.models.Card
    public String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.author.hashCode() ^ ((((((((this.type.hashCode() ^ 1000003) * 1000003) ^ this.text.hashCode()) * 1000003) ^ this.title.hashCode()) * 1000003) ^ this.description.hashCode()) * 1000003);
    }

    public String toString() {
        return "Card{type=" + this.type + ", text=" + this.text + ", title=" + this.title + ", description=" + this.description + ", author=" + this.author + "}";
    }
}
