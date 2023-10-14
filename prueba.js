

<script>
    document.addEventListener("DOMContentLoaded", function () {
        const cards = document.querySelectorAll(".card");

        cards.forEach(card => {
            card.addEventListener("click", function () {
                const link = card.querySelector("a");
                if (link) {
                    window.location.href = link.href; // Redirige a la URL del enlace
                }
            });
        });
    });
</script>
