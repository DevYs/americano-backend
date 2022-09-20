CREATE TABLE IF NOT EXISTS publisher_rss (
    publisher_rss_no    INTEGER     PRIMARY KEY AUTOINCREMENT,
    favicon             TEXT        NOT NULL,
    name                TEXT        NOT NULL,
    rss_url             TEXT        NOT NULL,
    reg_date            TIMESTAMP   NOT NULL DEFAULT CURRENT_TIMESTAMP,
    mod_date            TIMESTAMP   NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS news (
    news_no     INTEGER     PRIMARY KEY AUTOINCREMENT,
    title       TEXT        NOT NULL,
    link        TEXT        UNIQUE NOT NULL,
    description TEXT        NOT NULL,
    pub_date    TEXT        NOT NULL,
    image       TEXT        NOT NULL,
    author      TEXT        NOT NULL,
    reg_date    TIMESTAMP   NOT NULL DEFAULT CURRENT_TIMESTAMP
);