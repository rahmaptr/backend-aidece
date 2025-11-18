-- Example initial migration (portable between PostgreSQL and H2)
CREATE TABLE IF NOT EXISTS app_changelog (
    changelog_key VARCHAR(50) PRIMARY KEY,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);